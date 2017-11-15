package Calculadora;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import space.indietech.produtoNovo.ProdutoBO;
import space.indietech.produtoNovo.ProdutoEntity;

public class CalculadoraService {

	private CalculadoraDao cDao;

	@Autowired
	public CalculadoraService(CalculadoraDao cDao) {
		this.cDao = cDao;
	}

public void calcular() {
		List<CalculadoraEntity> entities = cDao.getValorPelaExpressao("somar");
		CalculadoraEntity bos = new CalculadoraEntity();
		
		for (CalculadoraEntity entity : entities) {
			CalculadoraBO bo = new CalculadoraBO ();	
	
		
			bo.setValor(entity.getValor());
			bo.setCriadoEm(entity.getCriadoEm());
			bo.setExpressao(entity.getExpressao());
		
		calc = em.find(ProdutoEntity.class, valor);
	
// public List<ProdutoBO> getLista() {
// List<ProdutoEntity> entities = pDao.getListaProdutos();
// List<ProdutoBO> bos = new ArrayList<>();
// for (ProdutoEntity entity : entities) {
// ProdutoBO bo = new ProdutoBO();
// bo.setCodigo(entity.getCodigo());
// bo.setNome(entity.getNome());
// double lucro = entity.getPerc_lucro() / 100 * entity.getCusto();
// bo.setValorfinal(entity.getCusto() + lucro);
// bos.add(bo);
//
// }