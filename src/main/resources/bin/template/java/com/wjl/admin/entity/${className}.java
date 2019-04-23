<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
<#assign tableName = table.sqlName> 
package ${basepackage}.${subpackage}.entity;

import com.alibaba.fastjson.annotation.JSONField;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Table;
/**
 * mysql_table:${table.sqlName}.
 * @author 736662094
 */
 
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "${tableName}")
public class ${className} extends BaseEntity implements Serializable {

	<#list table.columns as column>
	/**
	 * ${column.columnAlias}.
	 */
		<#if column.columnNameLower ? contains("Date")>
	@JSONField(format = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
		<#elseif column.columnNameLower ? contains("Time")>
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
		</#if>
	private ${column.simpleJavaType} ${column.columnNameLower};
	</#list>
}