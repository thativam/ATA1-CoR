public abstract class PedidoHandler implements IPedidoHandler {
    private IPedidoHandler nextHandler;


    @Override
    public IPedidoHandler setNext(IPedidoHandler handler) {
        this.nextHandler = handler;
        return handler; 
    }

    boolean checkNext(Pedido pedido) {
        if (nextHandler == null) {
            return true;
        }
        return nextHandler.handle(pedido);
    }

    @Override
    public abstract boolean handle(Pedido pedido);
}
