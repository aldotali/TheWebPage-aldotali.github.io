
    var slideIndexW = 1;
    showSlidesW(slideIndexW);


    // Next/preWious controls
    function plusSlidesW(n) {
        showSlidesW(slideIndexW += n);
    }

    // Thumbnail image controls
    function currentSlideW(n) {
        showSlidesW(slideIndexW = n);
    }

    function showSlidesW(n) {
        
        var i;
        var slides = document.getElementsByClassName("mySlidesW");
        if (n > slides.length) {slideIndexW = 1}
        if (n < 1) {slideIndexW = slides.length}
        for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none";
        }
        slides[slideIndexW-1].style.display = "block";
    } 
