
    var slideIndexB = 1;
    showSlidesB(slideIndexB);


    // Next/previous controls
    function plusSlidesB(n) {
        showSlidesB(slideIndexB += n);
    }

    // Thumbnail image controls
    function currentSlideB(n) {
        showSlidesB(slideIndexB = n);
    }

    function showSlidesB(n) {
        
        var i;
        var slides = document.getElementsByClassName("mySlidesB");
        if (n > slides.length) {slideIndexB = 1}
        if (n < 1) {slideIndexB = slides.length}
        for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
        }
        slides[slideIndexB-1].style.display = "block";
    } 

