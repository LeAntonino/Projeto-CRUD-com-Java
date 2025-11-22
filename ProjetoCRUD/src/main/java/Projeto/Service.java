package Projeto;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Service {
   
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public void Adicionar(Produto p){
            produtos.add(p);
    }
    
    public ArrayList<Produto> Listar(){
        return produtos;
    }
    
    public boolean Remover(int id){
        if(id >= produtos.size() || id < 0){
            return false;
        }else{
            produtos.remove(id);
            return true;
        }
    }
    public boolean Atualizar(int id, Produto p){
        if(id >= produtos.size() || id < 0){
            return false;
        }else if(p == null){
            return false;
        }
        else{
            produtos.set(id, p);
            return true;
        }
    }
        
    public static void main(String[] args){
        ProdutoView produtoview = new ProdutoView();
        produtoview.setVisible(true);
    }
      
}
