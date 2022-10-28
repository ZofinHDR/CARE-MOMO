$(document).ready(function () {
    $('#socialView').hide();
    $('#transparencyView').hide();
    $('#functionalityView').hide();
});

document.getElementById("hideInfoViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlySocialViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#infoView').hide();
    $('#socialView').show();
    var formData = new FormData(document.querySelector('#formPerson'));
    console.log(formData);
}
document.getElementById("hideSocialViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5")
    $('#onlySocialViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#socialView').hide();
    $('#transparencyView').show();
    var formData = new FormData(document.querySelector('#formSocial'));
    console.log(formData);
}
document.getElementById("hideTransparencyViewBtn").onclick = function () {
    $('#onlyTransparencyViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlySocialViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyFunctionalityViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#transparencyView').hide();
    $('#functionalityView').show();
    var formData = new FormData(document.querySelector('#formTrancparency'));
    console.log(formData);
}
document.getElementById("backToTransparencyViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5")
    $('#onlySocialViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#functionalityView').hide();
    $('#transparencyView').show();
}
document.getElementById("backToSocialViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlySocialViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#transparencyView').hide();
    $('#socialView').show();
}
document.getElementById("backToInfoViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlySocialViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#socialView').hide();
    $('#infoView').show();
}
document.getElementById("onlyInfoViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlySocialViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#infoView').show();
    $('#socialView').hide();
    $('#transparencyView').hide();
    $('#functionalityView').hide();
}
document.getElementById("onlySocialViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlySocialViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#infoView').hide();
    $('#socialView').show();
    $('#transparencyView').hide();
    $('#functionalityView').hide();
}
document.getElementById("onlyTransparencyViewBtn").onclick = function () {
    $('#onlyFunctionalityViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5")
    $('#onlySocialViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyTransparencyViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#infoView').hide();
    $('#socialView').hide();
    $('#transparencyView').show();
    $('#functionalityView').hide();
}
document.getElementById("onlyFunctionalityViewBtn").onclick = function () {
    $('#onlyTransparencyViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlySocialViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyInfoViewBtn').removeClass("nav-link active fs-5").addClass("nav-link fs-5");
    $('#onlyFunctionalityViewBtn').removeClass("nav-link fs-5").addClass("nav-link active fs-5");
    $('#infoView').hide();
    $('#socialView').hide();
    $('#transparencyView').hide();
    $('#functionalityView').show();
}

document.getElementById("save").onclick = function () {

    var formPerson = new FormData(document.querySelector('#formPerson'));
    var formSocial = new FormData(document.querySelector('#formSocial'));
    var formTrancparency = new FormData(document.querySelector('#formTrancparency'));
    var formFunctionality = new FormData(document.querySelector('#formFunctionality'));
    var formPersonObj = Object.fromEntries(formPerson);
    formPersonObj["social"] = Object.fromEntries(formSocial);
    formPersonObj["transparency"] = Object.fromEntries(formTrancparency);
    formPersonObj["functionality"] = Object.fromEntries(formFunctionality);

    $.ajax({
        type: "POST",
        url: "http://localhost:8080/resident",
        data: JSON.stringify(formPersonObj),
        dataType:"json",
        contentType: 'application/json',
        success: function(response){
            console.log(response);
            document.location.href="/homeUserView"
        }
    });

}

