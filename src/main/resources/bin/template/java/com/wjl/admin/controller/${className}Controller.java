<#assign className = table.className>
<#assign classNameLower = className?uncap_first>
<#assign shortName = table.shortName>
package ${basepackage}.${subpackage}.controller;

import ${basepackage}.${subpackage}.entity.${className};
import ${basepackage}.${subpackage}.service.${className}ServiceI;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * ${className}.
 * @author 736662094
 */
 
@Controller
@Slf4j
public class ${className}Controller extends BaseController<${className}>{
	@Autowired
	${className}ServiceI ${classNameLower}Service; 

}