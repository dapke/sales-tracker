package com.jameselsey.salestracker.testing;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.BuildException;
import org.dbunit.ant.DbUnitTask;
import org.dbunit.ant.Operation;
import org.dbunit.database.DatabaseDataSourceConnection;
import org.dbunit.database.IDatabaseConnection;
import org.springframework.beans.factory.annotation.Required;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

public class DBUnitBootstrapper extends DbUnitTask
{
    private DataSource dataSource;
    private boolean enabled;

    public DBUnitBootstrapper()
    {
        setProject(new Project());
    }

    @Resource
    @Required
    public void setDataSource(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    public void setOperations(List<Operation> operations)
    {
        for(Operation operation : operations)
        {
            addOperation(operation);
            
        }

    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    @Override
    public void execute() throws BuildException
    {
        if(enabled)
        {
            super.execute();
        }
    }

    @Override
    protected IDatabaseConnection createConnection() throws SQLException
    {
        return new DatabaseDataSourceConnection(dataSource);
    }
}