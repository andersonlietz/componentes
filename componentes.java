import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PedidoDAO{

    @PersistenceContext
    private EntityManager entityManager();

    public List <pedido> listar() {

        return entityManager.createQuery("SELECT p FROM Pedido p", Pedido.class).getResultList();
    }
}






