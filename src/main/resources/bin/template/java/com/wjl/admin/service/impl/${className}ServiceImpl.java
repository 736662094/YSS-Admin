<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.service.impl;

import ${basepackage}.${subpackage}.entity.${className};
import ${basepackage}.${subpackage}.mapper.${className}Mapper;
import ${basepackage}.${subpackage}.service.${className}ServiceI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * ${className}.
 * @author 736662094
 */
 
@Service("${classNameLower}Service")
public class ${className}ServiceImpl extends BaseServiceImpl<${className}> implements ${className}ServiceI<${className}> {

	@Autowired
    private ${className}Mapper ${classNameLower}Mapper;
}
