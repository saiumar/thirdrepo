/*
 * INSERT COPYRIGHT HERE
 */

package reddy.kumar.sai.service;

import reddy.kumar.sai.dao.DProfileDao;
import reddy.kumar.sai.dao.DProfileDaoBean;
import reddy.kumar.sai.domain.DProfile;
import com.wadpam.gaelic.oauth.service.OAuth2UserServiceImpl;

/**
 *
 * @author sosandstrom
 */
public class ProfileService extends OAuth2UserServiceImpl<DProfile, DProfileDao> {

    public ProfileService() {
        super(DProfile.class, DProfileDaoBean.class);
    }

}
