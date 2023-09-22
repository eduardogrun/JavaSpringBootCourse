package eduardogrun.domain.repository;

import eduardogrun.domain.entity.Cliente;
import eduardogrun.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}