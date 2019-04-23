<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.mapper;

import ${basepackage}.${subpackage}.entity.${className};
import org.apache.ibatis.annotations.Mapper;

/**
 * ${className}.
 * @author 736662094
 */
 
@Mapper
public interface ${className}Mapper extends BaseMapper<${className}>{

}