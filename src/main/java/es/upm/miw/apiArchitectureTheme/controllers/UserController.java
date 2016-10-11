package es.upm.miw.apiArchitectureTheme.controllers;

import java.util.List;

import es.upm.miw.apiArchitectureTheme.daos.DaoFactory;
import es.upm.miw.apiArchitectureTheme.entities.Sport;
import es.upm.miw.apiArchitectureTheme.entities.User;
import es.upm.miw.apiArchitectureTheme.wrappers.UserListWrapper;
import es.upm.miw.apiArchitectureTheme.wrappers.UserWrapper;

public class UserController {

//	public boolean createVote(int themeId, int vote) {
//		Theme theme = DaoFactory.getFactory().getThemeDao().read(themeId);
//		if (theme != null) {
//			DaoFactory.getFactory().getVoteDao().create(new Vote(vote, theme));
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public VoteListWrapper voteList() {
//		List<Vote> votes = DaoFactory.getFactory().getVoteDao().findAll();
//		VoteListWrapper voteListWrapper = new VoteListWrapper();
//		for (Vote vote : votes) {
//			voteListWrapper.addVoteWrapper(new VoteWrapper(vote.getTheme().getName(),vote.getValue()));
//		}
//		return voteListWrapper;
//	}

}
