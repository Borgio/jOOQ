/**
 * This class is generated by jOOQ
 */
package org.jooq.example.gradle.db.information_schema.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QueryStatistics extends org.jooq.impl.TableImpl<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord> {

	private static final long serialVersionUID = -646229893;

	/**
	 * The singleton instance of <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code>
	 */
	public static final org.jooq.example.gradle.db.information_schema.tables.QueryStatistics QUERY_STATISTICS = new org.jooq.example.gradle.db.information_schema.tables.QueryStatistics();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord> getRecordType() {
		return org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord.class;
	}

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.SQL_STATEMENT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.String> SQL_STATEMENT = createField("SQL_STATEMENT", org.jooq.impl.SQLDataType.VARCHAR.length(2147483647), this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.EXECUTION_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Integer> EXECUTION_COUNT = createField("EXECUTION_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MIN_EXECUTION_TIME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Long> MIN_EXECUTION_TIME = createField("MIN_EXECUTION_TIME", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MAX_EXECUTION_TIME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Long> MAX_EXECUTION_TIME = createField("MAX_EXECUTION_TIME", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.CUMULATIVE_EXECUTION_TIME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Long> CUMULATIVE_EXECUTION_TIME = createField("CUMULATIVE_EXECUTION_TIME", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.AVERAGE_EXECUTION_TIME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Double> AVERAGE_EXECUTION_TIME = createField("AVERAGE_EXECUTION_TIME", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.STD_DEV_EXECUTION_TIME</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Double> STD_DEV_EXECUTION_TIME = createField("STD_DEV_EXECUTION_TIME", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MIN_ROW_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Integer> MIN_ROW_COUNT = createField("MIN_ROW_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MAX_ROW_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Integer> MAX_ROW_COUNT = createField("MAX_ROW_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.CUMULATIVE_ROW_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Long> CUMULATIVE_ROW_COUNT = createField("CUMULATIVE_ROW_COUNT", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.AVERAGE_ROW_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Double> AVERAGE_ROW_COUNT = createField("AVERAGE_ROW_COUNT", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * The column <code>INFORMATION_SCHEMA.QUERY_STATISTICS.STD_DEV_ROW_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord, java.lang.Double> STD_DEV_ROW_COUNT = createField("STD_DEV_ROW_COUNT", org.jooq.impl.SQLDataType.DOUBLE, this, "");

	/**
	 * Create a <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code> table reference
	 */
	public QueryStatistics() {
		this("QUERY_STATISTICS", null);
	}

	/**
	 * Create an aliased <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code> table reference
	 */
	public QueryStatistics(java.lang.String alias) {
		this(alias, org.jooq.example.gradle.db.information_schema.tables.QueryStatistics.QUERY_STATISTICS);
	}

	private QueryStatistics(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord> aliased) {
		this(alias, aliased, null);
	}

	private QueryStatistics(java.lang.String alias, org.jooq.Table<org.jooq.example.gradle.db.information_schema.tables.records.QueryStatisticsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.example.gradle.db.information_schema.InformationSchema.INFORMATION_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.example.gradle.db.information_schema.tables.QueryStatistics as(java.lang.String alias) {
		return new org.jooq.example.gradle.db.information_schema.tables.QueryStatistics(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.example.gradle.db.information_schema.tables.QueryStatistics rename(java.lang.String name) {
		return new org.jooq.example.gradle.db.information_schema.tables.QueryStatistics(name, null);
	}
}
