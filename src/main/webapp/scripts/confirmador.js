/**
 * confirmação de exclução de um contato
 *@autor jose camelo
 *@param idcon
 */
function confirmar(idcon) {

	let resposta = confirm("Confirma a exclusão deste contato ?");
	if (resposta === true) {
		//verificação
		//alert(idcon)
		window.location.href = "delete?idcon=" + idcon
	}
}