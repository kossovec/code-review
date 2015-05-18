package ua.goit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.goit.dao.ProjectDao;
import ua.goit.model.Project;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ProjectServiceImpl implements ProjectService {

  private final ProjectDao projectDao;

  @Autowired
  public ProjectServiceImpl(ProjectDao projectDao) {
    this.projectDao = projectDao;
  }

  @Override
  public void add(Project entity) {
    projectDao.add(entity);
  }

  @Override
  public Project getById(Integer id) {
    return projectDao.getById(id);
  }

  @Override
  public List<Project> getByUserId(Integer id) {
    return projectDao.getProjectsByUserId(id);
  }

  @Override
  public List<Project> getAll() {
    return projectDao.getAll();
  }

  @Override
  public void update(Project entity) {
    projectDao.update(entity);
  }

  @Override
  public void remove(Project entity) {
    projectDao.remove(entity);
  }

  @Override
  public List<Project> getProjectsByCategoryId(Integer categoryId) {
    return projectDao.getProjectsByCategoryId(categoryId);
  }
}