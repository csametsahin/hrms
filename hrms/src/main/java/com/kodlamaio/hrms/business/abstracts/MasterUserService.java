package com.kodlamaio.hrms.business.abstracts;

import java.util.List;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.MasterUser;

public interface MasterUserService {
				Result add(MasterUser masterUser);
				DataResult<List<MasterUser>> getAll();
}
