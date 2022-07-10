/**
 * validação de formulário
 @author José Camêlo
 */

function validar() {
	let nome = frmcontato.nome.value
	let fone = frmcontato.fone.value
	if (nome === "") {
		alert('Preencha o compo Nome')
		frmcontato.nome.focus()
		return false
	} else if (fone === "") {
		alert('Preencha o compo Fone')
		frmcontato.fome.focus()
		return false
	} else {
		document.forms["frmcontato"].submit()
	}
}