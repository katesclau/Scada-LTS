package org.scada_lts.web.mvc.api.graphql.types;

import graphql.annotations.GraphQLField;

public class DataPointValue {
	@GraphQLField
	public String field() {
		return "field";
	}	

}
