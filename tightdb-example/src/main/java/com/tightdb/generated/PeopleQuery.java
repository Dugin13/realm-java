/* This file was automatically generated by TightDB. */

package com.tightdb.generated;


import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB query and was automatically generated.
 */
public class PeopleQuery extends AbstractQuery<PeopleQuery, People, PeopleView> {

    public final StringQueryColumn<People, PeopleQuery> name;
    public final LongQueryColumn<People, PeopleQuery> age;
    public final BooleanQueryColumn<People, PeopleQuery> hired;

	public PeopleQuery(TableBase table, TableQuery query) {
		super(PeopleTable.TYPES, table, query);
        name = new StringQueryColumn<People, PeopleQuery>(PeopleTable.TYPES, table, query, 0, "name");
        age = new LongQueryColumn<People, PeopleQuery>(PeopleTable.TYPES, table, query, 1, "age");
        hired = new BooleanQueryColumn<People, PeopleQuery>(PeopleTable.TYPES, table, query, 2, "hired");
	}

}