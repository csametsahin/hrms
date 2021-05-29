package com.kodlamaio.hrms.core.adapters.abstracts;

import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.User;

public interface ICheckService {
                 Result CheckIfRealUser(User user);
}
