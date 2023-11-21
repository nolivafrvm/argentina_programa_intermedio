package clase_siete_act_patter_comb.strategy;

import clase_siete_act_patter_comb.entity.Empleado;
import clase_siete_act_patter_comb.repository.FileEmpleadoRepository;

import java.util.List;

public class FilePersistenceStrategy implements PersistenceStrategy
{
    private FileEmpleadoRepository fileEmpleadoRepository;

    public FilePersistenceStrategy(FileEmpleadoRepository fileEmpleadoRepository) {
        this.fileEmpleadoRepository = fileEmpleadoRepository;
    }

    @Override
    public Empleado getById(Long id) {
        return fileEmpleadoRepository.getById(id);
    }

    @Override
    public List<Empleado> getAll() {
        return fileEmpleadoRepository.getAll();
    }

    @Override
    public void save(Empleado empleado) {
        fileEmpleadoRepository.save(empleado);
    }

    @Override
    public void update(Empleado empleado) {
        fileEmpleadoRepository.update(empleado);
    }

    @Override
    public void delete(Long id) {
        fileEmpleadoRepository.delete(id);
    }
}
