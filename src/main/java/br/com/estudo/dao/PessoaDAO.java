package br.com.estudo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.estudo.entity.Pessoa;
import br.com.estudo.util.ConexaoUtil;

/**
 * 
 * @author D.Francisco
 *
 */
public class PessoaDAO {

    public void savePessoa(Pessoa pessoa) {
        EntityManager em = ConexaoUtil.getInstance().getEntityManager();
        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();
    }

    @SuppressWarnings("unchecked")
    public List<Pessoa> findPessoas() {
        EntityManager em = ConexaoUtil.getInstance().getEntityManager();
        Query qr = em.createQuery("SELECT p FROM Pessoa p", Pessoa.class);
        return qr.getResultList();
    }
}
