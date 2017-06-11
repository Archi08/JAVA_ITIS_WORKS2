package ru.itis.main.dao;

import ru.itis.main.mappers.RowMapper;
import ru.itis.main.models.Auto;
import ru.itis.main.models.User;
import ru.itis.main.utils.FileDaoQueryTemplate;

import java.util.List;

/**
 * 27.04.2017
 * AutoDaoFileBasedImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class AutoDaoFileBasedImpl implements AutoDao {

    private String fileName;
    private FileDaoQueryTemplate template;

    public AutoDaoFileBasedImpl(String fileName, FileDaoQueryTemplate template) {
        this.fileName = fileName;
        this.template = template;
    }

    private RowMapper<Auto> userRowMapper = new RowMapper<Auto>() {
        @Override
        public Auto mapRow(String row) {
            String rowAsArray[] = row.split(" ");
            Auto founded = new Auto(
                    Integer.parseInt(rowAsArray[0]),
                    rowAsArray[1],
                    rowAsArray[2],
                    rowAsArray[3],
                    Integer.parseInt(rowAsArray[4]));
            return founded;
        }
    };

    @Override
    public Auto find(int id) {
        return null;
    }

    @Override
    public int save(Auto model) {
        return 0;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Auto model) {

    }

    @Override
    public List<Auto> findAll() {
        return null;
    }

    @Override
    public List<Auto> findAllByUsed(boolean isUsed) {
        return null;
    }

    @Override
    public List<Auto> findAllAutoByUserId(int userId) {
        return null;
    }
}
