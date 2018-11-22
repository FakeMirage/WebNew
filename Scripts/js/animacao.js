 $(document).ready(function ()
        {
            $("a").eq(2).click(function(){
                $(this).animate({
                    opacity: 0.50,
                    fontSize: 40
     
                })
            });
        });