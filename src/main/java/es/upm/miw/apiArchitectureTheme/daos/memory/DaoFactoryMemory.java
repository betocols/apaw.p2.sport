package es.upm.miw.apiArchitectureTheme.daos.memory;

import es.upm.miw.apiArchitectureTheme.daos.DaoFactory;
import es.upm.miw.apiArchitectureTheme.daos.SportDao;
import es.upm.miw.apiArchitectureTheme.daos.UserDao;

public class DaoFactoryMemory extends DaoFactory {

	private SportDao themeDao;
	private UserDao voteDao;

	public DaoFactoryMemory() {
	}

	@Override
	public SportDao getThemeDao() {
		if (themeDao == null) {
			themeDao = new SportDaoMemory();
		}
		return themeDao;
	}

	@Override
	public UserDao getVoteDao() {
		if (voteDao == null) {
			voteDao = new UserDaoMemory();
		}
		return voteDao;
	}

}
