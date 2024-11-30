public class ValorPedidoHandler extends PedidoHandler {

    @Override
    public boolean handle(Pedido pedido) {
        if(pedido.getValor() < 1000){
            return false;
        }
        return checkNext(pedido);
    }
    
}
