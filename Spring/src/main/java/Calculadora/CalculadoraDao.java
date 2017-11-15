package Calculadora;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculadoraDao {

	private EntityManager em;

	@Autowired
	public CalculadoraDao(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public void calculadoraDao(CalculadoraEntity calculadora) {
		em.merge(calculadora);
	}

	public CalculadoraEntity getValorPelaExpressao(String expressao) {
		return em.find(CalculadoraEntity.class, expressao);
		// FIND = buscar uma informaçao
	}
}
