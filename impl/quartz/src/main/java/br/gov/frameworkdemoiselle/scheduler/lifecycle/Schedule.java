//Demoiselle Framework
// Copyright (C) 2014 SERPRO
// ============================================================================
// This file is part of Demoiselle Framework.
//
// Demoiselle Framework is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public License version 3
// as published by the Free Software Foundation.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License version 3
// along with this program; if not,  see <http://www.gnu.org/licenses />
// or write to the Free Software Foundation, Inc., 51 Franklin Street,
// Fifth Floor, Boston, MA  02110-1301, USA.
// ============================================================================
// Este arquivo é parte do Framework Demoiselle.
//
// O Framework Demoiselle é um software livre; você pode redistribuí-lo e/ou
// modificá-lo dentro dos termos da GNU LGPL versão 3 como publicada pela Fundação
// do Software Livre (FSF).
//
// Este programa é distribuído na esperança que possa ser útil, mas SEM NENHUMA
// GARANTIA; sem uma garantia implícita de ADEQUAÇÃO a qualquer MERCADO ou
// APLICAÇÃO EM PARTICULAR. Veja a Licença Pública Geral GNU/LGPL em português
// para maiores detalhes.
//
// Você deve ter recebido uma cópia da GNU LGPL versão 3, sob o título
// "LICENCA.txt", junto com esse programa. Se não, acesse <http://www.gnu.org/licenses />
// ou escreva para a Fundação do Software Livre (FSF) Inc.,
// 51 Franklin St, Fifth Floor, Boston, MA 02111-1301, USA.
package br.gov.frameworkdemoiselle.scheduler.lifecycle;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * @author 70744416353
 */
@Inherited
@Target(value = {ElementType.METHOD})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface Schedule {

    public String cron();

//    public String second() default "*";
//
//    public String minute() default "*";
//
//    public String hour() default "*";
//
//    public String dayOfMonth() default "*";
//
//    public String month() default "*";
//
//    public String dayOfWeek() default "*";
//
//    public String year() default "*";
}
