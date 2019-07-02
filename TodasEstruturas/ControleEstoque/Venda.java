import javax.swing.JOptionPane;

class Venda{
    public static void venda(){
        Cliente cliente = new Cliente();
        int codigoProduto[] = new int[5];
        int quantProduto[] = new int[5];
        boolean verificacaoProduto;
        for(int i = 0; i < 5; i++){
            codigoProduto[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o codigo do produto.","Codigo",JOptionPane.INFORMATION_MESSAGE));
            quantProduto[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade deste produto em estoque.","Estoque.",JOptionPane.INFORMATION_MESSAGE));
        }
        do{
        	verificacaoProduto = false;
            cliente.codigoCliente = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do cliente."));
            if(cliente.codigoCliente == 0){
                break;
            }
            cliente.codigoProdutoComprar = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto."));
            for(int i = 0; i < 5; i++){ //Verifico se o produto existe.
                if(cliente.codigoProdutoComprar == codigoProduto[i]){
                    cliente.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto."));
                    verificacaoProduto = true;
                    if(quantProduto[i] >= cliente.quantidade){ //Verifico se tenho a quantidade do produto em estoque.
                    	quantProduto[i] = quantProduto[i] - cliente.quantidade;
                        JOptionPane.showMessageDialog(null, "Pedido atendido. Obrigado e volte sempre.");
                        break;
                    }else{
                    	JOptionPane.showMessageDialog(null, "Nao temos estoque suficiente dessa mercadoria.", "ERRO", JOptionPane.ERROR_MESSAGE);
                    	break;
                    }
                }
            }
            if(!verificacaoProduto) {
            	JOptionPane.showMessageDialog(null, "Codigo inexistente.", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }while(true);
        for(int i = 0; i < 5; i++){
            JOptionPane.showMessageDialog(null,"O produto com o codigo "+codigoProduto[i]+" tem  "+quantProduto[i]+" unidades.");
        } 
    }
}