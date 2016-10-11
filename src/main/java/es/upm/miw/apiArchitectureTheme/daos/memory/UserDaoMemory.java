package es.upm.miw.apiArchitectureTheme.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.UserDao;
import es.upm.miw.apiArchitectureTheme.entities.User;

public class UserDaoMemory extends GenericMemoryDao<User> implements UserDao {

//	public UserDaoMemory() {
//		this.setMap(new HashMap<Integer,Vote>());
//	}
//
//	@Override
//	protected Integer getId(Vote entity) {
//		return entity.getId();
//	}
//
//	@Override
//	protected void setId(Vote entity, Integer id) {
//		entity.setId(id);
//	}
//
//	@Override
//	public List<Integer> findValueByThemeId(int themeId) {
//		List<Vote> votes = this.findAll();
//		List<Integer> votesValue = new ArrayList<>();
//		for (Vote vote : votes) {
//			if (vote.getTheme().getId() == themeId) {
//				votesValue.add(vote.getValue());
//			}
//		}
//		return votesValue;
//	}

}