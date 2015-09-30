/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liferay.faces.demos.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.liferay.faces.bridge.model.UploadedFile;


/**
 * This is a model managed bean that represents an applicant that is applying for a job.
 *
 * @author  "Neil Griffin"
 */
@ManagedBean(name = "applicantModelBean")
@ViewScoped
public class ApplicantModelBean implements Serializable {

	// serialVersionUID
	private static final long serialVersionUID = 7459628254337818761L;

	// Private Data Members
	private List<UploadedFile> uploadedFiles;
	private String city;
	private String comments;
	private Date dateOfBirth;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String postalCode;
	private Long provinceId;

	// Private Data Members (auto-fill)
	private String autoFillCity;
	private Long autoFillProvinceId;
	private String autoFillPostalCode;

	public ApplicantModelBean() {
		clearProperties();

		Calendar calendar = new GregorianCalendar();
		this.dateOfBirth = calendar.getTime();
	}

	public void clearProperties() {
		uploadedFiles = new ArrayList<UploadedFile>();
		city = null;
		comments = null;
		dateOfBirth = null;
		emailAddress = null;
		firstName = null;
		lastName = null;
		phoneNumber = null;
		postalCode = null;
		provinceId = null;
	}

	public void setAutoFillCity(String autoFillCity) {
		this.autoFillCity = autoFillCity;
	}

	public void setAutoFillPostalCode(String autoFillPostalCode) {
		this.autoFillPostalCode = autoFillPostalCode;
	}

	public void setAutoFillProvinceId(Long autoFillProvinceId) {
		this.autoFillProvinceId = autoFillProvinceId;
	}

	public String getCity() {

		if (autoFillCity == null) {
			return city;
		}
		else {
			return autoFillCity;
		}
	}

	public void setCity(String city) {

		if (autoFillCity == null) {
			this.city = city;
		}
		else {
			this.city = autoFillCity;
			autoFillCity = null;
		}
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {

		if (autoFillPostalCode == null) {
			return postalCode;
		}
		else {
			return autoFillPostalCode;
		}
	}

	public void setPostalCode(String postalCode) {

		if (autoFillPostalCode == null) {
			this.postalCode = postalCode;
		}
		else {
			this.postalCode = autoFillPostalCode;
			autoFillPostalCode = null;
		}
	}

	public Long getProvinceId() {

		if (autoFillProvinceId == null) {
			return provinceId;
		}
		else {
			return autoFillProvinceId;
		}
	}

	public void setProvinceId(Long provinceId) {

		if (autoFillProvinceId == null) {
			this.provinceId = provinceId;
		}
		else {
			this.provinceId = autoFillProvinceId;
			autoFillProvinceId = null;
		}
	}

	public List<UploadedFile> getUploadedFiles() {
		return uploadedFiles;
	}
}