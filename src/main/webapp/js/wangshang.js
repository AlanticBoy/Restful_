$(function () {
    $("#cls").click(function () {
        $("#name").val("");
        $("#segment").val("");
        $("#phone").val("");
    });
    $("#sbmit").click(function () {
        if (validation() === false) {
            return;
        }
        var entainment = $("input[name='entainment']:checked").val();
        $("#sbmit").attr("disabled",true);
        $.ajax({
            url: "/inter/insertAItem",
            type: "post",
            dataType: "json",
            data: {
                name: $("#name").val(),
                segment: $("#segment").val(),
                entainment: entainment,
                phone: $("#phone").val()
            },
            success: function (result) {
                alert(result.data.retMsg);
                $("#sbmit").removeAttr("disabled");
                window.location.reload();
                $("#name").val("");
                $("#segment").val("");
                $("#phone").val("");
            }
        });
    })
});
function validation() {
    var flag = true;
    var name = $("#name").val();
    if (isBlank(name)) {
        flag = false;
        $("#nameDiv").css("background-color", "pink");
        $("#nameSpan").text("姓名不能为空");

    }
    var segment = $("#segment").val();
    if (isBlank(segment)) {
        flag = false;
        $("#segmentDiv").css("background-color", "pink");
        $("#segSpan").text("班级不能为空");
    }
    var phone = $("#phone").val();
    var reg = /^1\d{10}$/;
    if (!reg.test(phone)) {
        flag = false;
        $("#phoneDiv").css("background-color", "pink");
        $("#phoneSpan").text("手机号码格式不正确");
    }
    return flag;
}

function isBlank(elemnt) {
    if ((elemnt == "") || (elemnt == null)) {
        return true;
    }
    return false;
}