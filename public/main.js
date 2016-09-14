function getUser(userData) {
    if (userData.length == 0) {
        $("#login").show();
    }
    else {
        $("#upload").show();
        $("#logout").show();
    }
}

$.get("/user", getUser);

function getPhotos(photosData) {
    for (var i in photosData) {
        var photo = photosData[i];
        var elem = $("<img>");
        elem.attr("src", photo.filename);
        $("#photos").append(elem);
    }
}


$.get("/photos", getPhotos);

$('#check-box-publicPhoto').attr('checked' ) == true