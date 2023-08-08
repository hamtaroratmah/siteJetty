$(function() {
	FrontEnd.onInitPage("congratsPage", function(page) {
		FrontEnd.ajax({
			action:"user/islogged",
			success:function(r) {
				if (!r) {
					FrontEnd.displayPage("loginPage");
				}
			}
		});
		
		page.find('[name=doLogout]').click(function() {
			
			FrontEnd.ajax({
				action:"user/logout",
				success:function(r) {
					if (r) {
						FrontEnd.displayPage("loginPage");
					}
				}
			});
			
		});
	});

});