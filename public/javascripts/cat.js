var CAT = new function() {
    var complete = false
    $(window).konami({
        code: [73,76,79,86,69,67,65,84,83],
        cheat: function() {
            if (!complete)
                $('body').append( '<iframe src="http://adultcatfinder.com/embed/" width="320" height="430" style="position:fixed;bottom:0px;right:10px;z-index:100" frameBorder="0"></iframe>')
            complete = true
        }
    })
}()
