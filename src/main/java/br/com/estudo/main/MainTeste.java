package br.com.estudo.main;

import java.util.HashMap;
import java.util.Map;

import br.com.estudo.dao.PessoaDAO;
import br.com.estudo.entity.Pessoa;
import br.com.estudo.entity.Telefone;

public class MainTeste {

    public static void main(String[] args) {
        
        PessoaDAO dao = new PessoaDAO();
        
        //pesistindo pessoas no banco de dados
        for (Pessoa p : getPessoas().values()) {
            dao.savePessoa(p);
        }
        
        //buscando pessoas que foram pesistidas no bando de dados
        for (Pessoa p : dao.findPessoas()) {
            System.out.println(p.getNome().concat(", foi inserido no banco de dados !"));
        }
        
    }

    //Pessoas que serao pesistidas no banco de dados
    public static Map<String, Pessoa> getPessoas() {

        Map<String, Pessoa> pessoas = new HashMap<String, Pessoa>();

        pessoas.put("diego", new Pessoa(1L, "Diego Francisco", new Telefone(1L, "9544-1285")));
        pessoas.put("miguel", new Pessoa(2L, "Miguel Arcanjo", new Telefone(2L, "6269-5622")));
        pessoas.put("ester", new Pessoa(3L, "Ester Souza", new Telefone(3L, "9235-5912")));

        return pessoas;
    }
}
