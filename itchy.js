
    var slideIndexItchy = 1;
    showSlidesItchy(slideIndexItchy);


    // Next/previous controls
    function plusSlidesItchy(n) {
        showSlidesItchy(slideIndexItchy += n);
    }

    // Thumbnail image controls
    function currentSlideItchy(n) {
        showSlidesItchy(slideIndexItchy = n);
    }

    function showSlidesItchy(n) {
        
        var i;
        var slides = document.getElementsByClassName("mySlidesItchy");
        if (n > slides.length) {slideIndexItchy = 1}
        if (n < 1) {slideIndexItchy = slides.length}
        for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
        }
        slides[slideIndexItchy-1].style.display = "block";
    } 

