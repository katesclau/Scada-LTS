package org.scada_lts.web.mvc.api.graphql;

import graphql.TypeResolutionEnvironment;
import graphql.schema.GraphQLObjectType;
import graphql.schema.TypeResolver;

public class ScadaLTSTypeResolver implements TypeResolver {
	public GraphQLObjectType getType(TypeResolutionEnvironment env) {
		return env.getSchema().getObjectType(env.getFieldType().getName());
	}
}