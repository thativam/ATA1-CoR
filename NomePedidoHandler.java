public class NomePedidoHandler extends PedidoHandler{

    @Override
    public boolean handle(Pedido pedido) {
        if(pedido.getNomeCliente().length() < 5){
            return false;
        }

        return checkNext(pedido);
    }
    
}
