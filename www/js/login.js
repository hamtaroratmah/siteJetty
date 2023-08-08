$(function() {

	FrontEnd.onInitPage("loginPage", function(page) {
		
		page.find('[name=doLogin]').click(function() {
			
			FrontEnd.ajax({
				action:"user/login",
				data:{login:page.find('[name=login]').val(),
					password:page.find('[name=password]').val()
				},
				success:function(r) {
					if (r) {
						FrontEnd.displayPage("congratsPage");
					} else {
						FrontEnd.alert('Erreur','CANCEL','Cette combinaison de login/mot de passe est invalide.');
						page.find('[name=password]').val(''); // clear password;
					}
				}
			});
			
		});
	});

	FrontEnd.onDisplayPage("loginPage", function(page) {
		page.find('[name=password]').val(''); // clear password;
		
		FrontEnd.ajax({
			action:"user/islogged",
			success:function(r) {
				if (r) {
					FrontEnd.displayPage("congratsPage");
				}
			}
		});
	});

	FrontEnd.ajax({
		action:"user/islogged",
		success:function(r) {
			if (r) {
				FrontEnd.displayPage("congratsPage");
			} else {
				FrontEnd.displayPage("loginPage");				
			}
		}
	});
	
});