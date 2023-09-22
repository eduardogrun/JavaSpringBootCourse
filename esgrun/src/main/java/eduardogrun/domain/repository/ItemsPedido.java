package eduardogrun.domain.repository;

import eduardogrun.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository<Pedido, Integer> {


}
