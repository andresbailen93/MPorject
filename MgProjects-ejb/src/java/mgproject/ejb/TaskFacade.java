/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgproject.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mgproject.entities.Project;
import mgproject.entities.Task;

/**
 *
 * @author inftel23
 */
@Stateless
public class TaskFacade extends AbstractFacade<Task> {
    @PersistenceContext(unitName = "MgProjects-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TaskFacade() {
        super(Task.class);
    }
public List<Task> findTaskByProjectUser(Project project){
    List<Task> lista_task;
    lista_task = em.createNamedQuery("Task.findByProjectUser").setParameter("idproject", project).getResultList();
    return lista_task;
}
}
