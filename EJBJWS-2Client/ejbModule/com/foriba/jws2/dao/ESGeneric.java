package com.foriba.jws2.dao;

import javax.ejb.Local;
import javax.ejb.Remote;
import com.foriba.jws2.base.entity.BaseEntity;;

@Local
@Remote
public interface ESGeneric<T extends BaseEntity> extends DAOGeneric<T> {
	
}