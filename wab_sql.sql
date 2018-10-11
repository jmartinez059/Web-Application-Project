-- Sql code - Web Application Builder
-- Build tables

		/*			user pojo		*/
create table user_credentials (
	uc_id			int		
		constraint uc_pk primary key,
	u_name			text unique,
	p_word			text,
	foreign key(uc_id) references users(u_id)	 
);

create table user_pay_info (
	upi_id			int,
	cc_info			text,
	constraint primary key(up_id, cc_info),
	foreign key(upi_id) references users(u_id)
);

create table users (
	u_id			serial
		constraint u_pk primary key,
	f_name			text,
	l_name			text,
	email			text,
	experienced		boolean	
);

create table curr_charges (
	cc_id		serial
		constraint cc_pk primary key,
	cc_u_id			int,
	page_count		int,
	total_amount	numeric(14,2),
	foreign key(cc_u_id) references users(u_id)
);


		/*			page pojo		*/
create table page (
	p_id			serial
		constraint pg_pk primary key,
	p_u_id			text,
	pg_name			text,
	active			boolean,
	foreign key(p_u_id) references users(u_id)
);


			/*		accesible files     */
create table page_comp (
	pc_id			serial
		constraint pc_pk primary key,
	comp_id			int,
	page_id			int,
	parent_id		int,
	comp_details	text,
	style_id		int
	foreign key(comp_id) references defined_comp(dc_id),
	foreign key(parent_id) references page_comp(pc_id),
	foreign key(style_id) references style_details(sd_id)
	
);

create table defined_comp (
	dc_id			serial
		constraint dc_pk primary key,
	comp_name		text,
	comp_type		text	
);

create table style_details (
	sd_id			serial
		constraint sd_pk primary key,
	details			text,
	--file_name			text
);


			/*		unpublished page pojo		*/
create table unpub_pages(
	up_id			serial
		constraint up_pk primary key,
	up_u_id 		int,
	pg_name			text,
	active			boolean
	foreign key(up_u_id) references users(u_id)
);