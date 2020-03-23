var favoritosCliente =(function(){
	
	return {
		getFavoritos: function(id,callback) {
			$.ajax({
				url: "preferencia/ByUser/"+id,
				success: function (result) {
					callback(result);
				},
				async: true
			});
		},
		getArticulo: function(id,callback) {
			$.ajax({
				url: "publicacion/getById/"+id,
				success: function (result) {
					callback(result);
				},
				async: true
			});
		}
	};
})();