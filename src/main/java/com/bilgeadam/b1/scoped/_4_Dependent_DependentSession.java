package com.bilgeadam.b1.scoped;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

// bütün kullanıcıdır kulalnıcı için geçerlidir.
// Aynı browserda yaşar farklı browserda yaşamaz
// sessionscope implements yazılmalıdır.
@Named
@SessionScoped
public class _4_Dependent_DependentSession implements Serializable {
	private static final long serialVersionUID = -3112160708263140526L;
	
	@Inject
	_4_a_Dependent dependent;
}
