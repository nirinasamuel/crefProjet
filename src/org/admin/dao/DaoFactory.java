package org.admin.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.admin.dao.UtilisateurDao;
import org.admin.dao.impl.UtilisateurDaoImpl;

import org.admin.dao.PersonnelDao;
import org.admin.dao.impl.PersonnelDaoImpl;

import org.admin.dao.BachelierDao;
import org.admin.dao.impl.BachelierDaoImpl;

import org.admin.dao.CandidatDao;
import org.admin.dao.impl.CandidatDaoImpl;

import org.admin.dao.EtudiantDao;
import org.admin.dao.impl.EtudiantDaoImpl;

import org.admin.dao.CritereDao;
import org.admin.dao.impl.CritereDaoImpl;

import org.admin.dao.InscriptionDao;
import org.admin.dao.impl.InscriptionDaoImpl;

import org.admin.dao.DerogationDao;
import org.admin.dao.impl.DerogationDaoImpl;

import org.admin.dao.stat.StatPreinscriptionDao;
import org.admin.dao.stat.impl.StatPreinscriptionDaoImpl;

public class DaoFactory
{
	private String url;
	private String username;
	private String password;
	DaoFactory(String url, String username,String password)
	{
		this.url=url;
		this.username=username;
		this.password=password;
	}

	public static DaoFactory getInstance()
	{
		try{
			Class.forName("org.postgresql.Driver");
		}
		catch (ClassNotFoundException e)
		{
		}
		DaoFactory instance =new DaoFactory("jdbc:postgresql://localhost:5432/bdd","postgres","123456");

		return instance;
	}

	public Connection getConnection() throws SQLException
	{
		return DriverManager.getConnection(url,username,password);
	}

	public UtilisateurDao getUtilisateurDao()
	{
		return new UtilisateurDaoImpl(this);
	}
	public CandidatDao getCandidatDao()
	{
		return new CandidatDaoImpl(this);
	}
	public EtudiantDao getEtudiantDao()
	{
		return new EtudiantDaoImpl(this);
	}
	public BachelierDao getBachelierDao()
	{
		return new BachelierDaoImpl(this);
	}

	public CritereDao getCritereDao()
	{
		return new CritereDaoImpl(this);
	}

	public StatPreinscriptionDao getStatPreinscriptionDao()
	{
		return new StatPreinscriptionDaoImpl(this);
	}

	public InscriptionDao getInscriptionDao()
	{
		return new InscriptionDaoImpl(this);
	}

	public PersonnelDao getPersonnelDao()
	{
		return new PersonnelDaoImpl(this);
	}

	public DerogationDao getDerogationDao()
	{
		return new DerogationDaoImpl(this);
	}
	public UrlDao getUrlDao()
	{
		return new UrlDaoImpl(this);
	}
}
