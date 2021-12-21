package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Set;
@Repository
public class RoleDAOImpl implements RoleDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getRoles() {

      //  System.out.println( entityManager.createQuery("select r from Role r").getResultList());

        return  entityManager.createQuery("select r from Role r",Role.class).getResultList();
    }

    @Override
    public Role getRoleById(String id) {
        return entityManager.find(Role.class, Long.valueOf(id));
    }

    @Override
    public Role getRoleByName(String name) {

  //      System.out.println((Role) entityManager.createQuery("select r from Role r where r.role= :name")          .setParameter("name", name).getSingleResult());

        return  entityManager.createQuery("select r from Role r where r.role= :name",Role.class)
                .setParameter("name", name).getSingleResult();
    }
}
