package cl.trustbank.db_user_svc.repository.address;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.trustbank.db_user_svc.model.entity.address.Address;

public interface AddressRepositrory extends JpaRepository<Address, Integer> {
	
}
