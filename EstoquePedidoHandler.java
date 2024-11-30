public class EstoquePedidoHandler extends PedidoHandler {

    @Override
    public boolean handle(Pedido pedido) {
        if(!pedido.isEstoqueDisponivel()){
            return false;
        }
        return checkNext(pedido);
    }
    
}
