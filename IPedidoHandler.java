public interface IPedidoHandler {

    public IPedidoHandler setNext(IPedidoHandler handler);
    public boolean handle(Pedido pedido);
}